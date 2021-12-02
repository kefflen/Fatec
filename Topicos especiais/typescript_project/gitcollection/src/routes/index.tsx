import React from 'react'
import { Route, Switch } from 'react-router-dom'
import { Dashboard } from '../pages/Dashboard'
import { DashboardMovie } from '../pages/DashboardMovie'
import { Repository } from '../pages/Repository'

export const Routes: React.FC = () => {

    return (

        <Switch>
            <Route component={DashboardMovie} path="/" exact/>
            <Route component={Dashboard} path="/github" exact/> 
            <Route component={Repository} path="/repo"/>
        </Switch>
    )

}