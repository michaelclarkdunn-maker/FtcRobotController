package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class AutonomousTest1 extends LinearOpMode {
    //Declaring Motors
    DcMotor backLeft;
    DcMotor frontLeft;
    DcMotor backRight;
    DcMotor frontRight;
    ElapsedTime timer = new ElapsedTime();

    @Override
    public void runOpMode() throws InterruptedException {
        //Assigning Motors
        backLeft = (DcMotor) hardwareMap.get("backLeft");
        frontLeft = (DcMotor) hardwareMap.get("frontLeft");
        backRight = (DcMotor) hardwareMap.get("backRight");
        frontRight = (DcMotor) hardwareMap.get("frontRight");

        //Reverse direction bc some are backwards
        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeft.setDirection(DcMotorSimple.Direction.REVERSE);


        //wait for driver to press PLAY (dont pause. press it >:3)
        waitForStart();

        //Makes sure exit is possible during init
        // (OH CRAP IT'S EXPLODi-oh i can stop it fine)
        if (isStopRequested()) {
            return;
        }

        //if nothing breaks, autonomous has now started (les go)
        //forward 2 seconds
        moveForwardTime(2);

        //backward 2 seconds
        moveBackwardTime(2);

        //strafe right 2 seconds
        strafeRightTime(2);

        //strafe Left 2 seconds
        strafeLeftTime(2);

        //turn right 2 seconds
        turnRightTime(2);

        //turn left 2 seconds
        turnLeftTime(2);





    }













 //function for easily stoping movement (so robot doesn't murder toes)
    public void stopMovementMotors(){
        telemetry.addLine("Stoping movement");
        frontLeft.setPower(0);
        backLeft.setPower(0);
        frontRight.setPower(0);
        backRight.setPower(0);
    }



  //function for moving forward
    public void moveForwardTime(double time) {
            telemetry.addLine("Moving forward");
            frontLeft.setPower(1);
            backLeft.setPower(1);
            frontRight.setPower(1);
            backRight.setPower(1);
            timer.reset();
            while (opModeIsActive() && timer.time() <= time){
                //waiting out timer
            }
            stopMovementMotors();
    }





    //function for moving backward
    public void moveBackwardTime(double time){
            telemetry.addLine("Moving backward");
            frontLeft.setPower(-1);
            backLeft.setPower(-1);
            frontRight.setPower(-1);
            backRight.setPower(-1);
            timer.reset();
            while(opModeIsActive() && timer.time() <= time){
                //wait out timer
            }
            stopMovementMotors();
    }



    //function for strafing right
    public void strafeRightTime(double time){
            telemetry.addLine("Strafing right");
            frontLeft.setPower(1);
            backLeft.setPower(-1);
            frontRight.setPower(-1);
            backRight.setPower(1);
            timer.reset();
            while(opModeIsActive() && timer.time() <= time){
                //wait out timer
            }
            stopMovementMotors();
    }


    //function for strafing left
    public void strafeLeftTime(double time){
            telemetry.addLine("Strafing left");
            frontLeft.setPower(-1);
            backLeft.setPower(1);
            frontRight.setPower(1);
            backRight.setPower(-1);
            timer.reset();
            while(opModeIsActive() && timer.time() <= time){
                //wait out timer
            }
            stopMovementMotors();
    }


    //function for turning right
    public void turnRightTime(double time){
            telemetry.addLine("Turning Right");
            frontLeft.setPower(1);
            backLeft.setPower(1);
            frontRight.setPower(-1);
            backRight.setPower(-1);
            timer.reset();
            while(opModeIsActive() && timer.time() <= time){
                //wait out timer
            }
            stopMovementMotors();
    }


    //function for turning left
    public void turnLeftTime(double time){
            telemetry.addLine("Turing Left");
            frontLeft.setPower(-1);
            backLeft.setPower(-1);
            frontRight.setPower(1);
            backRight.setPower(1);
            timer.reset();
            while(opModeIsActive() && timer.time() <= time){
                //wait out timer
            }
            stopMovementMotors();
    }
}