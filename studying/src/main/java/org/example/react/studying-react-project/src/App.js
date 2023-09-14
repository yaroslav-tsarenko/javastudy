import './App.css';
import {useState} from "react";

function computeInitialCounter() {
    console.log('Some calculations...')
    return Math.trunc(Math.random() * 20)
}

function App() {
    /* const [counter, setCounter] = useState(0);
     const [counter, setCounter] = useState(computeInitialCounter);*/

    const [counter, setCounter] = useState(() => {
        return computeInitialCounter()
    })

    function increment() {
        setCounter((prevCounter) => {
            return prevCounter + 1
        })
        setCounter(prev => prev + 1)
    }

    function decrement() {
        setCounter(counter - 1)
    }

    return (
        <div>
            <h1>Counter: {counter}</h1>
            <button onClick={increment} className="btn btn-success">Add</button>
            <button onClick={decrement} className="btn btn-danger">Remove</button>
        </div>
    );
}

export default App;
