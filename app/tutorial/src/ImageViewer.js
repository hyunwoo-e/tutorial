import React, {Component} from 'react'
import logo from './logo.svg'

class ImageViewer extends Component {
    style = {
        width: 50,
        height: 50
    }

    render() {
        return (
            <div>
                <h1>이미지</h1>
                <div><image style={this.style} src={logo}/></div>
                <div><image style={this.style} src={require('./logo.svg')}/></div>
            </div>
        )
    }
}

export default ImageViewer;