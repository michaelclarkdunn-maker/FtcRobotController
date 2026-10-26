package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class AutonomousTest2 extends LinearOpMode {

//define motors
    DcMotor backLeft;
    DcMotor frontLeft;
    DcMotor backRight;
    DcMotor frontRight;

    //enum for robot states
    public enum RobotState{
        driveForward,
        turnRight,
        turnLeft,
        driveBackward,
        stopMovement

    }

    //current state
    public RobotState currentState = RobotState.driveForward;

}
