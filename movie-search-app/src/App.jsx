import React, { useEffect, useState } from 'react';
import SearchBar from './components/SearchBar';
import MovieList from './components/MovieList';

const App = () => {
  const [movies, setMovies] = useState([]);
  const [filteredMovies, setFilteredMovies] = useState([]);

  useEffect(() => {
    fetchMovies();
  }, []);

  const fetchMovies = async () => {
    try {
      const response = await fetch('http://localhost:3001/movies');
      const data = await response.json();
      setMovies(data);
      setFilteredMovies(data); // Initialize filtered movies
    } catch (error) {
      console.error('Error fetching movies:', error);
    }
  };

  const filterMovies = (searchTerm) => {
    setFilteredMovies(
      movies.filter((movie) =>
        movie.title.toLowerCase().includes(searchTerm.toLowerCase())
      )
    );
  };

  return (
    <div className="app-container">
      <h1 className="app-title">Movie Search App</h1>
      <SearchBar onSearch={filterMovies} />
      <MovieList movies={filteredMovies} />
    </div>
  );
};

export default App;
