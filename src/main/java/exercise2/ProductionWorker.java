package exercise2;

public class ProductionWorker implements Payable {
	int salaryPerProducedPiece;
	int producedPieceRate;

	protected ProductionWorker (int salaryPerProducedPiece)
	{
		this.salaryPerProducedPiece=salaryPerProducedPiece;
	}


	public void produceOnePiece() {
		producedPieceRate++;
	}

	public int computeSalary() {
		return producedPieceRate*salaryPerProducedPiece;
	}
}
