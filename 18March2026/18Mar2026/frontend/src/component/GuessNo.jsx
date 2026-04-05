import { useState } from "react";

function GuessNo(){
    const num=2;
    const[guess,setGuess]=useState(0);
    const[res,setResult]=useState();

    const check =()=>{
       
        if(Number(guess)==num){
            setResult("Success");
        } else{
            setResult("Unsuccessful");
        }
    }

    return (
        <>
        <div>Guessing number</div>
        <input
         type="number"
         value={guess}
         onChange={(e)=>setGuess(e.target.value)}
        />
        <button onClick={check}>Check</button>
        <h3>{res}</h3>
        </>
    );
}

export default GuessNo;