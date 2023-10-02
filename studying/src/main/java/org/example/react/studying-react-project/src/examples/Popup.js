import React, { useState } from "react"
import "./App.css"
import Modal from "./Modal";

function Popup() {
    const [show, setShow] = useState(false)
    return (
        <div className="App">
            <h1>Scratch Pad</h1>
            <button onClick={() => setShow(true)}>Show Modal</button>
            <Modal show={show}/>
            <button onClick={() => setShow(true)}>Show Modal</button>
            <Modal onClose={() => setShow(false)} show={show} />
        </div>
    )
}

export default App