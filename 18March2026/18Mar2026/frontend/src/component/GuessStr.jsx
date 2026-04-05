import { useState } from "react";

function GuessStr(){
    const a="Hello";
    const[guess,setGuess]=useState("");
    const[res,setResult]=useState("");

    const check =()=>{
       if(guess===a){
            setResult("Success");
        }
         else{
            setResult("Unsuccessful");
        }
    }

    return (
        <>
        <div>Guessing number</div>
        <input
           type="text"
         value={guess}
         onChange={(e)=>setGuess(e.target.value)}
        />
        <button onClick={check}>Check</button>
        <h2>{res}</h2>
        </>
    );
}

export default GuessStr;