SELECT * FROM AlimentoTipo; 
SELECT * FROM AlimentoTipo WHERE Nombre = 'Incectiviro';

SELECT IdAlimentoTipo
       ,Nombre
       ,Descripcion
        ,Estado       
        ,FechaCreacion
        ,FechaModifica
  FROM AlimentoTipo
 WHERE Nombre = 'Incectiviro';


 SELECT MAX(IdAlimentoTipo) FROM AlimentoTipo;