import { useState } from "react";

function GuessNumber() {
    const num=2;
    const[guess,setGuess]=useState("");
    const[result,setResult]=useState("");

    const check = () => {
        if(Number(guess)===num)
            setResult("Success");
        else 
            setResult("Unsuccess");

    }

    return (
        <>
        <div>Guesssing the number</div>
        <input
        type="number"
        value={guess}
        onChange={(e) => setGuess(e.target.value)}
      />

     <button onClick={check}>Check</button>
      <h3>{result}</h3>
      </>
    )
}
export default GuessNumber;