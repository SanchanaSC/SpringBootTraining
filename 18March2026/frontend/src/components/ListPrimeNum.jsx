import { useState } from "react";

function ListPrimeNum() {
    const num =[2,5,7,4,8,2];
    const [result,setResult]=useState([]);

    const checkPrime =() => {
      let temp = [];
      for (let i=0;i<num.length;i++){
        let n = num[i];
        let isPrime=true;

        if(n===0 || n===1){
            isPrime = false;
        } else {
            for(let j =2;j<=Math.sqrt(n);j++){
                if(n % j === 0){
                    isPrime=false;
                    break;
                } 
            }
        }
        temp.push(num[i] + "is"+(isPrime ? "prime": "Not Prime"));
      }
      setResult(temp);
    };

    return(
        <>
        <div>
            <div>To click the button to check prime Numbers</div>
            <button onClick={checkPrime}>Check</button>
            <h5>
                {result.map((item,index) => (
                <p key={index}>{item}</p>
                ))}
            </h5>
        </div>
        </>
    );
}
export default ListPrimeNum;