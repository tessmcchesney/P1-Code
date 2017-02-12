/**
 * This interface is implemented by the ScoreIterator in order
 * to point to Scores within a ScoreList
 *
 * <p>Bugs: none
 *
 * @author (your name)
 */
public interface ScoreIteratorADT {
	boolean hasNext();
	Score next();
}
