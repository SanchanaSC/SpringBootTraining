import { useState } from "react";

function GradingSystem(){
    const[marks,setMarks]=useState();
    const[result,setResult]=useState();

    const check = () => {
        if(Number(marks)>=90){
            setResult("A Grade");
        }else if(Number(marks)>=75){
            setResult("B Grade");
        }else if(Number(marks)>=55){
            setResult("C Grade");
        }else if(Number(marks)>=35){
            setResult("pass");
        }
        else{
            setResult("fail");
        }
    };
    return (
        <>
        <div>Result</div>
        <input type="number"
        value={marks}
        onChange={(e) => setMarks(e.target.value)}
        />

        <button onClick={check}>Grade</button>
        <h3>{result}</h3>
        </>
    )
} 
export default GradingSystem;