import React, {Component, Fragment} from 'react';
import Counter from "./Counter";
import Timer from "./Timer";
import ImageViewer from "./ImageViewer";

class App extends Component {
    render() {
        const hello = 'Hello';
        let name = 'react';

        const style = {
            backgroundColor : 'black',
            color : 'white',
            fontSize : '12px'
        };

        return (
            <Fragment>
                <div style={style}>
                    {hello} {name}!
                    {
                        (function () {
                            if(hello === 'Hello') return <div>Hi</div>
                            else return <div>Bye</div>
                        })()
                    }
                </div>
                <Counter />
                <Timer />
                <ImageViewer />
            </Fragment>
        );
    }
}

export default App;