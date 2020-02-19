// package com.infosys.demo.controller;

// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;

// import com.infosys.demo.model.CustOrder;
// import com.infosys.demo.model.Product;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.client.RestTemplate;
// import org.springframework.web.reactive.function.client.WebClient;


// public class InvoiceResource {

//     public CustOrder[] getOrdersasArray() {
        
//     RestTemplate restTemplate = new RestTemplate();

//     ResponseEntity<CustOrder[]> response = restTemplate.getForEntity("http://localhost:8080/order/all", CustOrder[].class);
//     CustOrder[] invoice = response.getBody();
//     // @Autowired
//     // private RestTemplate restTemplate;
//         return invoice;

//     // @Autowired
    // private WebClient.Builder webClientBuilder;

    // @RequestMapping("/{user_id}")
    // public List<CustOrder> getInvoice(@PathVariable String user_id){
        
    //     List<Product> products = Arrays.asList();

    //     return products.stream().map(rating -> {

    //         webClientBuilder.build()
    //             .get()
    //             .uri("http://localhost:8080/order/" + products.get);
           
    
    //     });
       
        
//     }

// }