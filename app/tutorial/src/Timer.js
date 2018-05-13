import React, {Component} from 'react'

class Timer extends Component {
    state = {
        date : new Date()
    }

    handleGetTime = () => {
        this.setState({
            date: new Date()
        });
    }

    render() {
        return (
            <div>
                <h1>시계</h1>
                <button onClick={this.handleGetTime}>시계 업데이트</button>
                <div>현재 시간: {this.state.date.getHours() +":"+ this.state.date.getMinutes() +":"+ this.state.date.getSeconds()}</div>
            </div>
        )
    }
}

export default Timer;