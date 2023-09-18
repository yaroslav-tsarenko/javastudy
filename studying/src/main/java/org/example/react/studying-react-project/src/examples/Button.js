import React, {useRef} from 'react';
import {useClickAnimation} from "./useClickAnimation";

function Button() {

    const buttonRef = useRef();
    useClickAnimation(buttonRef, {});

    return (
        <div className="button-container" ref={buttonRef}>
            <button className="button-default">MyButton</button>
        </div>
    );
}

export default Button;