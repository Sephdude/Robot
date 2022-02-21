// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
  private TalonSRX front = new TalonSRX(9);
  private TalonSRX back = new TalonSRX(5);
  double frontSpeed = 0.0;
  double backSpeed = 0.0;
  /** Creates a new ExampleSubsystem. */
  public Intake() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
  public void setFront(double s){
    frontSpeed = s;
    front.set(ControlMode.PercentOutput, frontSpeed);
  }
}