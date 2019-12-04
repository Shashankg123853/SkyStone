package org.firstinspires.ftc.teamcode;

@Autonomous(name="Test")
public class Test extends LinearOpMode {
private DcMotor leftDrive, rightDrive;
double power = 0.5;

@Override
public void runOpMode()
{
leftDrive = hardware.map(DcMotor.class, " left_drive");
rightDrive = hardware.map(DcMotor.class, " right_drive");

waitForStart();
}
}



























































































