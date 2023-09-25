import React from 'react'

export default function Main({toggle}) {
    return (
        <>
            <h1>Hello with example of Context</h1>
            <button onClick={toggle} className={"btn btn-success"}>Show</button>
        </>
    )
}