package org.firstinspires.ftc.teamcode;

@Autonomous(name = "Test2")
Public class Test2 extends LinearOpMode {
private DcMotor leftDrive, rightDrive;


@Override
public void runOpMode()
{
leftDrive = hardwareMap.get(DcMotor.class, "left_drive");
rightDrive = hardwareMap.get(DcMotor.class, "right_drive");

waitForStart();
drive(motorPower(0.4, 1000);
 drive(motorPower(0.3,300);
 drive(motorPower(-0.7,100);

}
 public double motorPower (double speed) {
  double power = 1*speed;
  return power;
 }
 public void drive (double power, double time) {
 leftDrive.setPower(.power);
  rightDrive.setPower(-power);
  sleep(1000);
 }
}
