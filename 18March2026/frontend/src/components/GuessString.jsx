import { useState } from "react";

function GuessString() {
    const a="Hello";
    const[guess,setGuess]=useState("");
    const[result,setResult]=useState("");

    const check = () => {
        if(guess===a)
            setResult("Success");
        else 
            setResult("Unsuccess");

    }

    return (
        <>
        <div>Guesssing the String</div>
        <input
        type="text"
        value={guess}
        onChange={(e) => setGuess(e.target.value)}
      />

     <button onClick={check}>Check</button>
      <h3>{result}</h3>
      </>
    )
}
export default GuessString;