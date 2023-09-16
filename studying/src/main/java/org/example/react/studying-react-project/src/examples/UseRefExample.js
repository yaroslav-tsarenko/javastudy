import React, {useEffect, useRef, useState} from 'react';


function UseRefExample() {
   /* const [renderCounter, setRenderCount] = useState(1)*/
    const [value, setValue] = useState('initial')
    const renderCount = useRef(1)

    useEffect(() => {
        renderCount.current++
    });

    return (
        <div>
            <h1>Amount of renders: {renderCount.current}</h1>
            <input type="text" onChange={e => setValue(e.target.value)} value={value}/>
        </div>
    )
}

export default UseRefExample