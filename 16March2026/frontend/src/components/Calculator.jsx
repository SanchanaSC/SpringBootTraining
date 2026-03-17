import { useState } from "react";

function Calculator(){
    const [num1,setNum1]=useState(0);
    const [num2,setNum2]=useState(0);
    const [results,setResults]=useState(0);

    const Add=()=>{
        setResults(Number(num1)+Number(num2));
    }
     const Sub=()=>{
        setResults(Number(num1)-Number(num2));
    }
     const Mult=()=>{
        setResults(Number(num1)*Number(num2));
    }
     const Div=()=>{
        setResults(Number(num1)/Number(num2));
    }
     const Modules=()=>{
        setResults(Number(num1)%Number(num2));
    }
    return(
        <>
        <input
        type="number"
        value={num1}
        onChange={(e)=>setNum1(e.target.value)}
        />
         <input
        type="number"
        value={num2}
        onChange={(e)=>setNum2(e.target.value)}
        />
       <button onClick={Add}>Add</button>
       <button onClick={Sub}>Subtract</button>
       <button onClick={Mult}>Multiply</button>
       <button onClick={Div}>Divide</button>
       <button onClick={Modules}>Remainder</button>
        <h2>{results}</h2>
        </>
    );
}

export default Calculator;