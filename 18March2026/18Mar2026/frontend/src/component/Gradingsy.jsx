import { useState } from "react";

function GradingSy(){
    const[num,setNum]=useState();
    const[result,setResult]=useState();

    const grade=()=>{
        if(num>=90){
            setResult("A Grade");
        }
        else if(num>=80){
            setResult("B Grade");
        }
        else if(num>=70){
            setResult("C Grade");
        }
        else if(num>=60){
            setResult("D Grade");
        }
        else if(num>=50){
            setResult("E Grade");
        }
        else {
            setResult("F Grade");
        }
    }
    return(
        <>
        <div>Grade:</div>
        <input 
           type="number"
           value={num}
           onChange={(e)=>setNum(e.target.value)}
            />
            <button onClick={grade}>Grade</button>
            <h3>{result}</h3>
        </>
    );
}

export default GradingSy;