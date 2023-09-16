import React, {useState, useEffect} from 'react';
import * as events from "events";

function UseEffectExample() {

    const [type, setType] = useState('users')
    const [data, setData] = useState([])
    const [pos, setPos] = useState({
        x: 0, y: 0
    })

    console.log('Component render')

    /*useEffect(() => {
        console.log('render')
    })
*/

    useEffect(() => {
        fetch(`https://jsonplaceholder.typicode.com/${type}`)
            .then(response => response.json())
            .then(json => setData(json))
        return () => {
            console.log('clean type')
        }
    }, [type]);

    useEffect(() => {
        console.log('ComponentDidMount')
        window.addEventListener('mousemove', event => {
            setPos({
                x: event.clientX,
                y: event.clientY
            })
        })
    }, []);

    return (
        <div>
            <h1>Resource: {type}</h1>
            <button className="btn btn-success" onClick={() => setType('Users')}>Users</button>
            <button className="btn btn-success" onClick={() => setType('todos')}>ToDo</button>
            <button className="btn btn-success" onClick={() => setType('Posts')}>Posts</button>
             <pre>{JSON.stringify(data, null, 2)}</pre>
            <pre>{JSON.stringify(pos, null, 2)}</pre>
        </div>
    )
}

export default UseEffectExample;