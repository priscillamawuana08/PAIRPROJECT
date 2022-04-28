// import { render } from '@testing-library/react';
import * as React from 'react';
import { BrowserRouter as Router,  Route, Link } from 'react-router-dom';
import './App.css';
import Card from './Components/Card';
import Home from './Components/Home/Home';
// import { Route,Routes } from 'react-router-dom';

// function App() {
//   return (
//     <div className="App"> 
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }
function App() {
    
        return(
            <div className='App'>
                <Card/>
                
                <Home/>
                {/* 
                <nav className="navbar navbar-expand-lg navbar-light bg-light">
          <ul className="navbar-nav mr-auto">
            <li><Link to={'/'} className="nav-link"> Home </Link></li>
          </ul>
          </nav>
                
                    <Route exact path = '/'Component={Home}/> */}
                
            </div>
            
        
        )
    
}
export default App;
