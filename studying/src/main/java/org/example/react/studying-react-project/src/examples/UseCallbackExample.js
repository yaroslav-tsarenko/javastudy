import React, {useCallback, useState} from 'react';
import ItemList from "./ItemList";

function UseCallbackExample() {
    const [colored, setColored] = useState(false);
    const [count, setCount] = useState(1);

    const styles = {
        color: colored ? 'darkred' : 'black'
    }

    const generateItemFromAPI = useCallback((indexNumber) => {
        return new Array(count).fill('').map((_, i) => `Element ${i + 1}`)
    }, [count])

    return (
        <>
            <h1 style={styles}>Count of elements: {count}</h1>
            <button className={"btn btn-success"} onClick={() => setCount(prev => prev + 1)}>Add</button>
            <button className={"btn btn-warning"} onClick={() => setColored(prev => !prev)}>Edit</button>
            <ItemList getItems={generateItemFromAPI}/>
        </>
    );
};

export default UseCallbackExample;