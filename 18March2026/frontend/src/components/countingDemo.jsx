import { useState } from "react";

 function countingDemo() {
   const [count, setCount] = useState(0);

   const incrementCounter = () => {
    setCount(count + 1);
   };

  const decrementCount = () => {
     setCount(count - 1);
   };

   return (
         <>
     <div>Total Count: {count}</div>
       <button onClick={incrementCounter}>Add +1</button>
       <button onClick={decrementCount}>Sub -1</button>
     </>
   );
 }

 export default countingDemo;