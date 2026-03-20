

import GradingSystem from "./components/GradingSystem";
import GuessNumber from "./components/GuessNumber";
import GuessString from "./components/GuessString";
import ListDisplay from "./components/ListDisplay";
import ListPrimeNum from "./components/ListPrimeNum";
import PassFail from "./components/PassFail";
import PrimeNumber from "./components/PrimeNumber";
import SwitchFunction from "./components/switchFunction";
import countingDemo from "./components/countingDemo";
// import { useState } from "react";

// function App() {
//   const [count, setCount] = useState(0);

//   const incrementCounter = () => {
//     setCount(count + 1);
//   };

//   const decrementCount = () => {
//     setCount(count - 1);
//   };

//   return (
//     <>
//       <div>Total Count: {count}</div>
//       <button onClick={incrementCounter}>Add +1</button>
//       <button onClick={decrementCount}>Sub -1</button>
//     </>
//   );
// }

// export default App;
function App() {
  return(
    <div>
      <countingDemo/>
      <br/>
      <SwitchFunction/>
      <br/>
      <GuessNumber/>
      <br/>
      <GuessString/>
      <br/>
      <GradingSystem/>
      <br/>
      <div>Displaying list</div>
      <ListDisplay/>
      <br/>
      <PrimeNumber/>
      <br/>
      <PassFail/>
      <br/>
      <ListPrimeNum/>
    </div>
  );
}
export default App;