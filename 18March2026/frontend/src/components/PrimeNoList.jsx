import { useState } from "react";

function PrimeNoList() {
    const num = [12,67,34,45,89,10,13,17];
    const [show,setShow]=useState(false);

    const printPrime = () => {
        setShow(true);
    };
    return (
        <>
        <button onClick={printPrime}>print Prime</button>
        {show && num.map((n,index) => {
            if (n<=1) return null;

            for (let j=2;j<n;j++){
                if(n%j===0) return null;
            }
            return <h2 key ={index}>{n}</h2>
        })}
        </>
    );

}
export default PrimeNoList;