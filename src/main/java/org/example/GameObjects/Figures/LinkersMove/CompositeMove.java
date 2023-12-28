package org.example.GameObjects.Figures.LinkersMove;

import org.example.GameObjects.Figures.FuguresUtils.Coordinate;

import java.util.ArrayList;
import java.util.List;

public class CompositeMove {
    private List<MovePattern> movePatterns = new ArrayList<>();
    public void addMovePatterns(MovePattern movePattern){
        this.movePatterns.add(movePattern);
    }
    public ArrayList<Coordinate> coordinates(){
        //Логика создания всех ходов чот-то там
        return null;
    }
}
