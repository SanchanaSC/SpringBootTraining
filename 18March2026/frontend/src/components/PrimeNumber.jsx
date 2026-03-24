import { useState } from "react";

function PrimeNumber() {
    const [num,setNum]=useState();
    const [result,setResult]=useState();

    const isPrime = () =>{
       // const n = Number(num);
        if(num<=1){
            setResult("Not Prime");
            return;
        }
        for(let i=2;i<num;i++){
            if(num%i===0){
                setResult("Not Prime");
                return;
            }

        }
        setResult("Prime");
    };
    return (
        <>
        <div>Prime number</div>
        <input type="number"
        value={num}
         onChange={(e) => setNum(e.target.value)}
         />

         <button onClick={isPrime}>Prime</button>
         <h1>{result}</h1>
        </>
    )
}
export default PrimeNumber;