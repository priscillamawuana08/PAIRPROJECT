import * as  React from 'react';
import './Card.css';


function success(){
    alert("Login successful!")
}

function Card(){
   return(
        <div className='Card'>
            <div className='upper-container'>
                <div className='image-container'>
                    <img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRpygFJKJSZ1v0vQckiXcHQf15rYd_ErLRD5w&usqp=CAU' alt=' ' height="100px" width="100px" />

                </div>

            </div>
                <a href="https://bmtech.skedda.com/booking">
                <button className='button' onClick={success}> Sign up with Google</button>
                </a>
        </div>
        
        
   )
}

export default Card;