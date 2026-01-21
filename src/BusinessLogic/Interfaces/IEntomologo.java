package BusinessLogic.Interfaces;

import java.util.List;

import BusinessLogic.Entities.Alimento;
import BusinessLogic.Entities.Hormiga;
import DataAccess.DTOs.HormigaDTO;
import Infrastructure.AppException;

public interface IEntomologo {
    public List<HormigaDTO> etlAntNest() throws AppException; 
    public List<Alimento>   etlAntFood() ; 
    public Hormiga          alimentarAnt(Hormiga h, Alimento a); 
}