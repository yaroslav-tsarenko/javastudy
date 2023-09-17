import React, {useEffect, useMemo, useState} from 'react';

function complexCompute(num) {
    let i = 0
    while (i < 100) i++
    return num * 2
}

function UseMemoExample() {

    const [number, setNumber] = useState(42)
    const [colored, setColored] = useState(false)

    const styles = {
        color: colored ? 'darkred' : 'black'
    }

    const computed = useMemo(() => {
        return complexCompute(number)
    }, [number])

    useEffect(() => {
        console.log('Styles changed')
    }, [styles]);

    return (
        <>
            <h1 style={styles}>Computed property: {computed}</h1>
            <button className={"btn btn-success"} onClick={() => setNumber(prev => prev + 1)}>Add</button>
            <button className={"btn btn-danger"} onClick={() => setNumber(prev => prev - 1)}>Remove</button>
            <button className={"btn btn-warning"} onClick={() => setNumber(prev => prev - 1)}>Change</button>
        </>
    );
};

export default UseMemoExample;