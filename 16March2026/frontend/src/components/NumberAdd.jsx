import { useState } from "react";

function NumberAdd(){
    const [num1, setNum1]=useState(0);
    const [num2, setNum2]=useState(0);
    const [results, setResults]=useState(0);

    // function double(){
    //     setNum1(Number(num1)+Number(num1));
    // }

    const handleAdd =()=>{
        setResults(Number(num1)+Number(num2));
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
        <button onClick={handleAdd}>Add</button>
        {/* <h1>{num1}</h1>
        <h1>{num1}</h1> */}
        <h1>{results}</h1>
        </>
    )
}

export default NumberAdd;