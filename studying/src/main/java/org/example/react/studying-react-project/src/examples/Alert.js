import React, {useContext} from 'react';
import {AlertContext} from "./useContextExample"

export default function Alert() {

    const alert = useContext(AlertContext)

    if (!alert) return null

    return (
        <div className={'alert alert-danger'}>
            <p>This is very important message</p>
        </div>
    );
};

