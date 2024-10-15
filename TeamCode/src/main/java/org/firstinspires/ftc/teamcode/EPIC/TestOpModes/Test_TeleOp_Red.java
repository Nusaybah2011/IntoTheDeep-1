package org.firstinspires.ftc.teamcode.EPIC.TestOpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.EPIC.Robot.Robot;
import org.firstinspires.ftc.teamcode.EPIC.Sensors.MyTouchSensor;


@TeleOp(name = "Test TeleOp Red")
public class Test_TeleOp_Red extends LinearOpMode {
    double lefty;
    double leftx;
    double righty;
    double rightx;

    @Override
    public void runOpMode() throws InterruptedException {
//        Mecanum_Wheels wheels = new Mecanum_Wheels(hardwareMap);
//        wheels.initialize();
//        wheels.telemetry = telemetry;
//        wheels.parent = this;
        //wheels.leftErrorAdjustment = 0.52;
        //wheels.rightErrorAdjustment = 0.52;
//        MyTouchSensor touchSensor = new MyTouchSensor(hardwareMap);
//        touchSensor.initialize();
//        touchSensor.telemetry = telemetry;
//        touchSensor.parent = this;

        //Component Declaration
        //Arm declaration and initialization
//        Arm arm = new Arm(hardwareMap);
//        arm.setParent(this);
//        arm.setTelemetry(this.telemetry);
//        arm.setIsAutonomous(true);
//        arm.initialize();
//
//        //Wrist declaration and initialization
//        Wrist wrist = new Wrist(hardwareMap);
//        wrist.setParent(this);
//        wrist.setTelemetry(this.telemetry);
//        wrist.setIsAutonomous(true);
//        wrist.initialize();
//
//        //Claw declaration and initialization
//        Claw claw = new Claw(hardwareMap);
//        claw.setParent(this);
//        claw.setTelemetry(this.telemetry);
//        claw.setIsAutonomous(true);
//        claw.initialize();
//
//        Slider slider = new Slider(hardwareMap);
//        slider.setParent(this);
//        slider.setTelemetry(this.telemetry);
//
//        slider.setIsAutonomous(true);
//
//        slider.initialize();
        Robot robot = new Robot(this,"Red");
        robot.initialize();

        while (opModeInInit()){

        }


        boolean dup2;
        boolean ddown2;
        boolean y2;
        boolean a2;
        boolean x2;




        waitForStart();


        while (opModeIsActive()){
            robot.touchSensor.checkButtonPressed();
            //robot.colorSensor.getColor();
            lefty = gamepad1.left_stick_y;
            leftx = gamepad1.left_stick_x;
            righty = gamepad1.right_stick_y;
            rightx = gamepad1.right_stick_x;
            //robot.odysseyWrist.moveLeft(0.5);
            //sleep(100);
            //robot.odysseyArm.liftUp(500);
            //sleep(1000);
            //robot.odysseySlider.slide(1000);
            //wheels.move(lefty,righty,leftx,rightx);
            //if(touchSensor.isPressed()){
            //telemetry.addData("My Touch Sensor is pressed? ", touchSensor.isPressed());
            //telemetry.addData("My Touch Sensor press value: ", touchSensor.getValue());

            telemetry.addData("My Color Sensor is color? ", robot.colorSensor.getARGBColor());
            telemetry.addData("My Color Sensor distance in Inches: ", robot.colorSensor.getDistanceInInches());
            telemetry.addData("My Color Sensor distance in MMs: ", robot.colorSensor.getDistanceInMM());
            telemetry.update();
            sleep(2000);
            robot.odysseyClaw.close();
            sleep(2000);
            robot.odysseyClaw.open();
            //}
        }
    }
}