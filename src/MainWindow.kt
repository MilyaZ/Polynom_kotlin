package ru.milya
/*
import javax.swing.GroupLayout
import java.awt.Color
import java.awt.Dimension
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.WindowConstants
import javax.swing.border.EtchedBorder

class MainWindow :JFrame(){
    private val minSize = Dimension(550,400)
    private val mainPanel: JPanel
    private val contralPanel: JPanel
    init{
        //setSize(minSize)
        size = minSize
        //действие при нажатии на крестик
        defaultCloseOperation = EXIT_ON_CLOSE
        //чтобы слишком много не сжималась
        minimumSize = Dimension(minSize.width+50,minSize.height+50)

        //Панель
        mainPanel = JPanel()
        mainPanel.background = Color.BLUE
      //  mainPanel.setSize(400,300)
       // mainPanel.setLocation(10,10) //левый верхний угол создаются раскладкой

        contralPanel = JPanel()
        contralPanel.border = EtchedBorder()
        //layout = null, делается по размернам и точкам как указано

        val gl = GroupLayout(contralPanel)
        //в скобочках хост, своейство окна contentPane- часть окна без заголовка
        gl.setVerticalGroup(gl.createSequentialGroup()
            .addGap(4)
            .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE )
            .addGap(4)
            .addComponent(contralPanel,10,GroupLayout.PREFERRED_SIZE,GroupLayout.PREFERRED_SIZE)
            .addGap(4)
        //DEFAULT_SIZE - максимальный размер, PREFERRED_SIZE - внутренность помещается

        )
        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addGap(4)
            .addGroup(
                gl.createParallelGroup()
                    .addComponent(mainPanel, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE )
                    .addComponent(contralPanel,GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE )
            )
            .addGap(4)
        )
        layout=gl /*позволяет в автоматическом режиме управлять размещениями предметов внутри контейнера
        в данном случае контейнер - это окно, возможно размешение по горизонтали , вертикале, по центру и тд

        */
        //add(mainPanel) теперь оно само

    }
}*/
import java.awt.Color
import java.awt.Dimension
import javax.swing.GroupLayout
import javax.swing.JFrame
import javax.swing.JPanel
import javax.swing.border.EtchedBorder

open class MainWindow : JFrame(){

    private val minSize = Dimension(550, 400)
    private val mainPanel: JPanel
    private val controlPanel: LagrangeControl

    init{
        defaultCloseOperation = EXIT_ON_CLOSE
        minimumSize = Dimension(minSize.width+200, minSize.height+400)
        mainPanel = JPanel()
        mainPanel.background = Color.WHITE
        controlPanel = LagrangeControl()
        controlPanel.border = EtchedBorder()
        val gl = GroupLayout(contentPane)

        gl.setVerticalGroup(gl.createSequentialGroup()
            .addGap(4)
            .addComponent(mainPanel, minSize.height, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE)
            .addGap(4)
            .addComponent(controlPanel, 100, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
            .addGap(4)
        )

        gl.setHorizontalGroup(gl.createSequentialGroup()
            .addGap(4)
            .addGroup(
                gl.createParallelGroup()
                    .addComponent(mainPanel, minSize.width, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE)
                    .addComponent(controlPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE)
            )
            .addGap(4))
        layout = gl
        pack()
    }
}