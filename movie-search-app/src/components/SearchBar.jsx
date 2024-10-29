import React, { useState } from 'react';

const SearchBar = ({ onSearch }) => {
  const [searchTerm, setSearchTerm] = useState('');

  const handleInputChange = (e) => {
    const term = e.target.value;
    setSearchTerm(term);
    onSearch(term); // Call onSearch with the current term
  };

  return (
    <div className="search-bar-container">
      <input
        type="text"
        value={searchTerm}
        placeholder="Search for movies..."
        onChange={handleInputChange}
        className="search-input"
      />
      <button onClick={() => onSearch(searchTerm)} className="search-button">
        Search
      </button>
    </div>
  );
};

export default SearchBar;
