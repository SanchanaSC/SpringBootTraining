import { useState } from "react"

function PrimeNo(){
    const[num,setNum]=useState();
    const[res,setRes]=useState();

    const check=()=>{
        if(num<=1){
            setRes("Not a prime number");
        }else {
         for(let i=2;i<num;i++){
            if(num%i==0){
                setRes("It is not a prime number");
                return;
            } 
        }
        setRes("It is a prime number");
    }
}
    return (
        <>
          <div>Prime number</div>
          <input 
             type="number" 
             value={num}
             onChange={(e)=>setNum(e.target.value)}
              />
              <button onClick={check}>Check</button>
              <h3>{res}</h3>
        </>
    )

}

export default PrimeNo;