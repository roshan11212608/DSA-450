import openai
openai.api_key ="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"

def generate(prompt):
    response = openai.Completion.create(
    engine="davinci-codex",
    prompt= prompt1,
    temperature=0,
    max_tokens=1500,
    top_p=1,
    frequency_penalty=0.5,
    presence_penalty=0.5
    )
    
prompt1="The Tajmahal is the beautiful building of the world"
generate(prompt1)
response1=response.choices[0].text
print(response1)


    
        
   