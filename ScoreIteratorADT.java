/////////////////////////////////////////////////////////////////////////////
// Semester:         CS367 Spring 2017 
// PROJECT:          p1
// FILE:             ScoreIteratorADT.java
//
// TEAM:    Team 54, null
// Authors: (Be sure to check if programming teams are allowed)
// Author1: (name1,email1,netID1,lecture number1)
// Author2: (name2,email2,netID2,lecture number2)
////////////////////////////////////////////////////////////////////////////

/**
 * This interface is implemented by the ScoreIterator in order to point
 * at different Scores in a ScoreList.
 *
 * <p>Bugs: none
 *
 * @author (your name)
 */
public interface ScoreIteratorADT {
	boolean hasNext();
	Score next();
}
