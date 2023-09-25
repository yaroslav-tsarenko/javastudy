import React, {useEffect, useRef, useState} from 'react';


function UseRefExample() {
    /* const [renderCounter, setRenderCount] = useState(1)*/
    const [value, setValue] = useState('initial');
    const renderCount = useRef(1);
    const inputRef = useRef(null);
    const prevValue = useRef('');
    useEffect(() => {
        renderCount.current++
    });

    useEffect(() => {
        prevValue.current = value
    }, [value]);


    return (
        <div>
            <h1>Amount of renders: {renderCount.current}</h1>
            <input type="text" ref={inputRef} onChange={e => setValue(e.target.value)} value={value}/>
        </div>

    )
}

export default UseRefExample