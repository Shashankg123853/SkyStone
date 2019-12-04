package org.firstinspires.ftc.teamcode;

@Autonomous(name = "Test2")
Public class Test2 extends LinearOpMode {
private DcMotor leftDrive, rightDrive;
double power = 0.5;

@Override
public void runOpMode()
{
leftDrive = hardwareMap.get(DcMotor.class, "left_drive");
rightDrive = hardwareMap.get(DcMotor.class, "right_drive");

waitForStart();
 leftDrive.setPower(power);
 rigthDrive.setPower(power);
 sleep(1000);

}
}
