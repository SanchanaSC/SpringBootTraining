import { useState } from "react"
import "./Calc.css";

function Calc(){
    const [expression,setExpression]=useState("");
    const [result,setResult]=useState("");

    const calculate=()=>{
        try{
            setResult(eval(expression));
        } catch {
            setResult("Invalid Expression");
        }
    };
    return (
        <>
         <input
           type="text"
           placeholder="(5+7*2)"
           value={expression}
           onChange={(e)=>setExpression(e.target.value)}
           />
           <button onClick={calculate} >Calculate</button>
           <h2>{result}</h2>
        </>
    )
}
export default Calc;