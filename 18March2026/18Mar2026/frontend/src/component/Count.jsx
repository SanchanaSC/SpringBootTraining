import { useState } from "react";

function Count(){
  const[count ,setCount]=useState(0);

  const incrementCounter=()=>{
    setCount(count+1);
  };
   const decrementCounter=()=>{
    setCount(count-1);
  };

  return(
    <>
      <div>Total count:{count}</div>
      <button onClick={incrementCounter}>Add+1</button>
      <button onClick={decrementCounter}>Sub-1</button>
      
    </>
  )
}

export default Count;


