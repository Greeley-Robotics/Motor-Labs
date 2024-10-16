package frc.robot;

import frc.robot.Constants.MOTORLABSConstants;
import frc.robot.commands.MOTORLABS;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

public class RobotContainer {
  // private final Joystick m_driverController =
  //     new Joystick(MOTORLABSConstants.kDriverControllerPort);

  private final Drivetrain m_drivetrain = new Drivetrain();  // m_driverController

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {

  }

  public Command getDriveForwardAuto() {
    return new MOTORLABS(m_drivetrain);
  }
}
