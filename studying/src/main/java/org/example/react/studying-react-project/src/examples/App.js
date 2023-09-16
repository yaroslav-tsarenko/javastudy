import '../App.css';
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

    const [state, setState] = useState({
        title: 'Counter',
        date: Date.now()
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

    function updateTitle() {
        setState(prev => {
            return {
                ...prev,
                title: 'New name'
            }
        })
    }

    return (
        <div>
            <h1>Counter: {counter}</h1>
            <button onClick={increment} className="btn btn-success">Add</button>
            <button onClick={decrement} className="btn btn-danger">Remove</button>
            <button onClick={updateTitle} className="btn btn-default">Change name</button>
            <pre>{JSON.stringify(state, null, 2)}</pre>
        </div>
    );
}

export default App;
