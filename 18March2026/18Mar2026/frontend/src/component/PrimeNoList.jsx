import { useState } from "react";

function PrimeNoList() {
  const num = [12, 67, 34, 45, 89, 10, 13, 17];
  const [show, setShow] = useState(false);

  const printPrime = () => {
    setShow(true);
  };

  return (
    <>
      <button onClick={printPrime}>Print Prime</button>

      {show &&
        num.map((n, index) => {
          if (n <= 1) return null;

          for (let j = 2; j < n; j++) {
            if (n % j === 0) return null;
          }

          return <h2 key={index}>{n}</h2>;
        })}
    </>
  );
}

export default PrimeNoList;


// import { useState } from "react";

// function ListP() {
//   const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
//   const [result, setResult] = useState([]);

//   const checkPrimes = () => {
//     let temp = [];

//     for (let i = 0; i < numbers.length; i++) {
//       let n = numbers[i];
//       let isPrime = true;

//       if (n === 0 || n === 1) {
//         isPrime = false;
//       } else {
//         for (let j = 2; j <= Math.sqrt(n); j++) {
//           if (n % j === 0) {
//             isPrime = false;
//             break;
//           }
//         }
//       }
//       temp.push(numbers[i] + " is " + (isPrime ? "Prime" : "Not Prime"));
//     }

//     setResult(temp);
//   };

//   return (
//     <div>
//       <button onClick={checkPrimes}>Check</button>

//       <h3>
//         {result.map((item, index) => (
//           <p key={index}>{item}</p>
//         ))}
//       </h3>
//     </div>
//   );
// }
// export default ListP;