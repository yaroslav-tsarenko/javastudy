import React, {useState} from 'react';
import Main from "./Main";
import Alert from "./Alert";

export const AlertContext = React.createContext()

function UseContextExample() {

    const [alert, setAlert] = useState(false)
    const toggleAlert = () => setAlert(prev => !prev)

    return (
        <AlertContext.Provider value={alert}>
            <div className={'container pt-3'}>
                <Alert/>
                <Main toggle={toggleAlert}/>
            </div>
        </AlertContext.Provider>
    )
}

export default UseContextExample;