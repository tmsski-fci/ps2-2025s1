async function asyncCriarProf(dadosProfessor, proxsucesso, proxerro) {
    const URL = `/api/professores`;
    const postRequest = {
        method: 'POST',
        body: JSON.stringify(dadosProfessor),
        headers: { 'Content-type': 'application/json' }
    };
    fetch(URL, postRequest)
        .then(resposta => { if (!resposta.ok) throw Error(resposta.status); return resposta; } )
        .then(resposta => resposta.json())
        .then(jsonResponse => proxsucesso())
        .catch(proxerro);
}

async function asyncLerProfs(proxsucesso, proxerro) {
    const URL = `/api/professores`;
    fetch(URL)
      .then(resposta => { if (!resposta.ok) throw Error(resposta.status); return resposta;}) 
      .then(resposta => resposta.json())
      .then(jsonresponse => proxsucesso(jsonresponse))
      .catch(proxerro);
}

async function asyncLerProfById(id, proxsucesso, proxerro) {
    const URL = `/api/professores/${id}`;
    fetch(URL)
      .then(resposta => { if (!resposta.ok) throw Error(resposta.status); return resposta;}) 
      .then(resposta => resposta.json())
      .then(jsonresponse => proxsucesso(jsonresponse))
      .catch(proxerro);
}

async function asyncAlterarProf(dadosProfessor, proxsucesso, proxerro) {
    const URL = `/api/professores/${dadosProfessor.id}`;
    const putRequest = {
        method: 'PUT',
        body: JSON.stringify(dadosProfessor),
        headers: { 'Content-type': 'application/json' }
    };
    fetch(URL, putRequest)
        .then(resposta => { if (!resposta.ok) throw Error(resposta.status); return resposta; } )
        .then(resposta => resposta.json())
        .then(jsonResponse => proxsucesso())
        .catch(proxerro);	        	
}

async function asyncApagarProf(id, proxsucesso, proxerro) {
    const URL = `/api/professores/${id}`;
    const deleteRequest = {
        method: 'DELETE'
    };
    fetch(URL, deleteRequest)
        .then(resposta => { if (!resposta.ok) throw Error(resposta.status); return resposta; } )
        .then(resposta => proxsucesso())
        .catch(proxerro);	        		
}

async function asyncCriarFac(dadosFaculdade, proxsucesso, proxerro) {
    const URL = `/api/faculdades`;
    const postRequest = {
        method: 'POST',
        body: JSON.stringify(dadosFaculdade),
        headers: { 'Content-type': 'application/json' }
    };
    fetch(URL, postRequest)
        .then(resposta => { if (!resposta.ok) throw Error(resposta.status); return resposta; } )
        .then(resposta => resposta.json())
        .then(jsonResponse => proxsucesso())
        .catch(proxerro);
}

async function asyncLerFacs(proxsucesso, proxerro) {
    const URL = `/api/faculdades`;
    fetch(URL)
      .then(resposta => { if (!resposta.ok) throw Error(resposta.status); return resposta;}) 
      .then(resposta => resposta.json())
      .then(jsonresponse => proxsucesso(jsonresponse))
      .catch(proxerro);
}

async function asyncLerFacById(id, proxsucesso, proxerro) {
    const URL = `/api/faculdades/${id}`;
    fetch(URL)
      .then(resposta => { if (!resposta.ok) throw Error(resposta.status); return resposta;}) 
      .then(resposta => resposta.json())
      .then(jsonresponse => proxsucesso(jsonresponse))
      .catch(proxerro);
}

async function asyncAlterarFac(dadosFaculdade, proxsucesso, proxerro) {
    const URL = `/api/faculdades/${dadosFaculdade.id}`;
    const putRequest = {
        method: 'PUT',
        body: JSON.stringify(dadosFaculdade),
        headers: { 'Content-type': 'application/json' }
    };
    fetch(URL, putRequest)
        .then(resposta => { if (!resposta.ok) throw Error(resposta.status); return resposta; } )
        .then(resposta => resposta.json())
        .then(jsonResponse => proxsucesso())
        .catch(proxerro);	        	
}

async function asyncApagarFac(id, proxsucesso, proxerro) {
    const URL = `/api/faculdades/${id}`;
    const deleteRequest = {
        method: 'DELETE'
    };
    fetch(URL, deleteRequest)
        .then(resposta => { if (!resposta.ok) throw Error(resposta.status); return resposta; } )
        .then(resposta => proxsucesso())
        .catch(proxerro);	        		
}